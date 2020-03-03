module flexmark.ext.autolink {
    requires flexmark;
    requires flexmark.util.sequence;
    requires annotations;
    requires autolink;
    requires flexmark.util.ast;
    requires flexmark.util.data;
    exports com.vladsch.flexmark.ext.autolink;
    exports com.vladsch.flexmark.ext.autolink.internal;
}
