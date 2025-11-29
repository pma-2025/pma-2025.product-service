package store.product;

import java.util.List;

public class ProductParser {

    public static Product to(ProductIn in) {
        return in == null ? null :
            Product.builder()
                .name(in.name())
                .email(in.email())
                .password(in.password())
                .build();
    }

    public static ProductOut to(Product a) {
        return a == null ? null :
            ProductOut.builder()
                .id(a.id())
                .name(a.name())
                .email(a.email())
                .build();
    }

    public static List<ProductOut> to(List<Product> as) {
        return as == null ? null :
            as.stream().map(ProductParser::to).toList();
    }

}