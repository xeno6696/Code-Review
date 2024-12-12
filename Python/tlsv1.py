import requests
import ssl

print(ssl.OPENSSL_VERSION)

class HTTPAdapter(requests.adapters.HTTPAdapter):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def init_poolmanager(self, *args, **kwargs):
        ssl_context = ssl.create_default_context()
        ssl_context.minimum_version = ssl.TLSVersion.TLSv1
        ssl_context.maximum_version = ssl.TLSVersion.TLSv1
        kwargs["ssl_context"] = ssl_context
        return super().init_poolmanager(*args, **kwargs)

with requests.Session() as s:
    s.mount("https://", HTTPAdapter())
    response = s.get("https://rccitrix.rockwellcollins.com:443")
    print(response.text)