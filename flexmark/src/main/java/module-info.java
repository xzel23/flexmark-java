module flexmark {
    requires annotations;
    requires flexmark.util.data;
    requires flexmark.util.misc;
    requires flexmark.util.dependency;
    requires flexmark.util.format;
    requires flexmark.util.sequence;
    requires flexmark.util.ast;
    requires flexmark.util.html;
    requires flexmark.util.visitor;
    requires flexmark.util.collection;
    requires flexmark.util.builder;
    exports com.vladsch.flexmark.ast;
    exports com.vladsch.flexmark.ast.util;
    exports com.vladsch.flexmark.formatter;
    exports com.vladsch.flexmark.html;
    exports com.vladsch.flexmark.html.renderer;
    exports com.vladsch.flexmark.parser;
    exports com.vladsch.flexmark.parser.block;
    exports com.vladsch.flexmark.parser.core;
    exports com.vladsch.flexmark.parser.core.delimiter;
    exports com.vladsch.flexmark.parser.delimiter;
    exports com.vladsch.flexmark.formatter.internal;
}
