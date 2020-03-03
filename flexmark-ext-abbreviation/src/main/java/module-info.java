module flexmark.ext.abbreviation {
    requires flexmark.util.sequence;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.ast;
    requires flexmark;
    requires flexmark.util.data;
    requires flexmark.util.format;
    requires flexmark.ext.autolink;
    exports com.vladsch.flexmark.ext.abbreviation;
}
