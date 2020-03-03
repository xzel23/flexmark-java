module flexmark.util.experimental {
    requires annotations;
    requires flexmark.util.sequence;
    requires flexmark.util.collection;
    requires flexmark.util.ast;
    requires flexmark.util.misc;
    requires flexmark.util.data;
    exports com.vladsch.flexmark.experimental.util.collection;
    exports com.vladsch.flexmark.experimental.util.collection.iteration;
    exports com.vladsch.flexmark.experimental.util.data;
    exports com.vladsch.flexmark.experimental.util.mappers;
    exports com.vladsch.flexmark.experimental.util.sequence.managed;
}
