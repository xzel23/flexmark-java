module flexmark.pdf.converter {
    requires openhtmltopdf.jsoup.dom.converter;
    requires openhtmltopdf.pdfbox;
    requires openhtmltopdf.core;
    requires openhtmltopdf.rtl.support;
    requires flexmark.util.data;
    requires flexmark.util.misc;
    requires pdfbox;
    requires org.jsoup;
    requires java.xml;
    exports com.vladsch.flexmark.pdf.converter;
}
