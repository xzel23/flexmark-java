module flexmark.ext.admonition {
    requires flexmark;
    requires flexmark.util.data;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.ast;
    requires flexmark.util.sequence;
    requires flexmark.util.html;
    exports com.vladsch.flexmark.ext.admonition;
}
