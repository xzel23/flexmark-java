module flexmark.profile.pegdown {
    requires flexmark;
    requires flexmark.ext.abbreviation;
    requires flexmark.ext.anchorlink;
    requires flexmark.ext.footnotes;
    requires flexmark.ext.escaped.character;
    requires flexmark.ext.definition;
    requires flexmark.ext.autolink;
    requires flexmark.ext.gfm.strikethrough;
    requires flexmark.ext.gfm.tasklist;
    requires flexmark.ext.superscript;
    requires flexmark.ext.ins;
    requires flexmark.ext.toc;
    requires flexmark.ext.tables;
    requires flexmark.ext.typographic;
    requires flexmark.ext.wikilink;
    requires flexmark.util.ast;
    requires flexmark.util.data;
    requires flexmark.util.misc;
    exports com.vladsch.flexmark.profile.pegdown;
}
