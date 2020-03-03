module flexmark.docx.converter {
    requires flexmark.util.ast;
    requires flexmark.util.data;
    requires flexmark;
    requires docx4j.core;
    requires docx4j.openxml.objects;
    requires flexmark.util.visitor;
    requires flexmark.util.sequence;
    requires org.jetbrains.annotations;
    requires flexmark.ext.attributes;
    requires flexmark.ext.aside;
    requires flexmark.ext.emoji;
    requires flexmark.ext.enumerated.reference;
    requires flexmark.ext.tables;
    requires flexmark.ext.ins;
    requires flexmark.ext.superscript;
    requires flexmark.ext.toc;
    requires flexmark.ext.macros;
    requires flexmark.ext.gitlab;
    requires flexmark.ext.footnotes;
    requires flexmark.ext.gfm.strikethrough;
    requires flexmark.util.html;
    requires flexmark.util.misc;
    requires flexmark.util.format;
    requires java.desktop;
    requires xmlgraphics.commons;
    requires slf4j.api;
    requires flexmark.util.collection;
    requires flexmark.util.builder;
    requires flexmark.util.dependency;
    requires java.xml;
    exports com.vladsch.flexmark.docx.converter;
    exports com.vladsch.flexmark.docx.converter.util;
}
