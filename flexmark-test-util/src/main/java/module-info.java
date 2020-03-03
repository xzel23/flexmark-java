module flexmark.test.util {
    requires flexmark.util.ast;
    requires org.jetbrains.annotations;
    requires 
flexmark.util.data;
    requires junit;
    requires flexmark.util.format;
    requires flexmark.util.misc;
    requires flexmark.util.sequence;
    requires hamcrest.core;
    exports com.vladsch.flexmark.test.util;
    exports com.vladsch.flexmark.test.util.spec;
}
