module flexmark.util.sequence {
    requires flexmark.util.misc;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.data;
    requires flexmark.util.collection;
    exports com.vladsch.flexmark.util.sequence;
    exports com.vladsch.flexmark.util.sequence.builder;
    exports com.vladsch.flexmark.util.sequence.builder.tree;
    exports com.vladsch.flexmark.util.sequence.mappers;
}
