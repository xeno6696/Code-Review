import requests
import ssl

print(ssl.OPENSSL_VERSION)

class HTTPAdapterTLS(requests.adapters.HTTPAdapter):
    def __init__(self, tls_version, *args, **kwargs):
        self.tls_version = tls_version
        super().__init__(*args, **kwargs)

    def init_poolmanager(self, *args, **kwargs):
        ssl_context = ssl.SSLContext(self.tls_version)
        ssl_context.set_ciphers('DEFAULT@SECLEVEL=1')
        kwargs["ssl_context"] = ssl_context
        return super().init_poolmanager(*args, **kwargs)

# Attempt connection with both TLS 1.0 and TLS 1.1
url = "https://rccitrix.rockwellcollins.com:443"

with requests.Session() as session:
    try:
        # First, try with TLS 1.0
        session.mount("https://", HTTPAdapterTLS(ssl.PROTOCOL_TLSv1))
        response = session.get(url, timeout=10)
        print("Connected using TLS 1.0")
        print(response.text)
    except requests.exceptions.SSLError as e:
        print(f"TLS 1.0 failed: {e}")

    try:
        # If TLS 1.0 fails, try with TLS 1.1
        session.mount("https://", HTTPAdapterTLS(ssl.PROTOCOL_TLSv1_1))
        response = session.get(url, timeout=10)
        print("Connected using TLS 1.1")
        print(response.text)
    except requests.exceptions.SSLError as e:
        print(f"TLS 1.1 failed: {e}")