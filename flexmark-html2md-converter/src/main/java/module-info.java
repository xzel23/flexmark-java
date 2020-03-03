module flexmark.html2md.converter {
    requires org.jsoup;
    requires flexmark.util.dependency;
    requires flexmark.util.data;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.misc;
    requires flexmark.util.format;
    requires flexmark.util.html;
    requires flexmark.util.sequence;
    requires flexmark;
    requires flexmark.ext.emoji;
    requires flexmark.util.ast;
    requires flexmark.util.builder;
    exports com.vladsch.flexmark.html2md.converter;
}
