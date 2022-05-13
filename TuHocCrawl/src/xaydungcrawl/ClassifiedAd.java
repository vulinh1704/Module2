package xaydungcrawl;

enum TypePrice {
    PRICE_PER_M2, // loại giá dựa trên m2
    TOTAL_PRICE // giá toàn bộ
}
enum Unit {
    MILLION_VND,
    BILLION_VND
}
class Price {
    private float price;
    private TypePrice typePrice;
    private Unit unit;
}
enum TypeAd {
    SELL,
    RENTAL,
    OTHER,
}


public class ClassifiedAd {
    private String title;// tiêu đề
    private TypeAd typeAd;// loại tên
    private Price price;//giá
    private Float acreage;//diện tích
    private String description;//mô tả
}
