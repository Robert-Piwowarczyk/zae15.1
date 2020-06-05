import java.math.BigDecimal;
import java.util.List;


class CalculatorPrice {


    static Sum calculateStats(List<ProductPrice> productPrices) {
        BigDecimal nettoSum = sumNettoPrice(productPrices);
        BigDecimal vatSum = sumVatPrice(productPrices);
        BigDecimal bruttoSum = sumBruttoPrice(productPrices);
        return new Sum(nettoSum, vatSum, bruttoSum);
    }

    static BigDecimal sumNettoPrice(List<ProductPrice> productPrices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ProductPrice productPrice : productPrices) {
            sum = sum.add(productPrice.getNettoPrice());
        }
        return sum;
    }

    static BigDecimal sumVatPrice(List<ProductPrice> productPrices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ProductPrice productPrice : productPrices) {
            sum = sum.add(productPrice.getTax());
        }
        return sum;
    }

    static BigDecimal sumBruttoPrice(List<ProductPrice> productPrices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ProductPrice productPrice : productPrices) {
            sum = sum.add(productPrice.getBruttoPrice());
        }
        return sum;
    }
}