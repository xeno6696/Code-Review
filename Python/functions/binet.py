import numpy

#constant values.  Python lacks a true "constant" concept though you could work around this by declaring 
#a class with a getter but no setter.  We can talk about this when we reach classes.
phi = numpy.longdouble(( 1 + 5 ** 0.5) / 2)
reciprocalphi = numpy.longdouble( 1 - phi )


def binetFormula( number ):
    number = numpy.longdouble(number)
    result = (( phi ** number ) - (reciprocalphi ** number))/ numpy.longdouble(5 ** 0.5)
    return int( result )
