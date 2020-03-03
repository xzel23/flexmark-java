module flexmark.ext.gitlab {
    requires flexmark;
    requires flexmark.util.ast;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.sequence;
    requires flexmark.util.data;
    requires flexmark.util.misc;
    requires flexmark.util.html;
    exports com.vladsch.flexmark.ext.gitlab;
    exports com.vladsch.flexmark.ext.gitlab.internal;
}
