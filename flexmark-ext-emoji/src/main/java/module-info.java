module flexmark.ext.emoji {
    requires flexmark.util.ast;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.sequence;
    requires flexmark;
    requires flexmark.util.data;
    requires flexmark.util.misc;
    exports com.vladsch.flexmark.ext.emoji;
    exports com.vladsch.flexmark.ext.emoji.internal;
}
