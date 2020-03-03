module flexmark.ext.toc {
    requires flexmark;
    requires flexmark.util.data;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.sequence;
    requires flexmark.util.ast;
    requires flexmark.util.misc;
    requires flexmark.util.html;
    requires flexmark.util.options;
    requires flexmark.util.format;
    requires flexmark.util.collection;
    exports com.vladsch.flexmark.ext.toc;
    exports com.vladsch.flexmark.ext.toc.internal;
}
