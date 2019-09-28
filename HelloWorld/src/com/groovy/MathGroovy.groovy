class MathGroovy {

    public static BigDecimal deltaJava(BigDecimal a, BigDecimal b, BigDecimal c){
        BigDecimal  bSquare = b.multiply(b);
        BigDecimal  fourAC = new BigDecimal(4).multiply(a.multiply(c));
        BigDecimal  result  = bSquare.subtract(fourAC);
    }

    static BigDecimal deltaGroovy (BigDecimal a, BigDecimal b, BigDecimal c) {
        (b*b) - (4*a*c)
    }

    def deltaSimple( a, b, c ) {
        (b*b) - (4*a*c)
    }

}