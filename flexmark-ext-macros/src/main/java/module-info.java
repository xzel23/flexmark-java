module flexmark.ext.macros {
    requires flexmark.util.ast;
    requires flexmark.util.sequence;
    requires annotations;
    requires flexmark;
    requires flexmark.util.data;
    requires flexmark.util.format;
    requires flexmark.ext.gitlab;
    exports com.vladsch.flexmark.ext.macros;
}
