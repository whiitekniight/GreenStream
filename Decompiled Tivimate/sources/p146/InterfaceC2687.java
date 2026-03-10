package p146;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p115.AbstractC2398;

/* JADX INFO: renamed from: ˉʼ.ʽ */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC2687 {
    String condition() default "";

    EnumC2690 delivery() default EnumC2690.f9607;

    boolean enabled() default true;

    InterfaceC2694[] filters() default {};

    Class invocation() default AbstractC2398.class;

    int priority() default 0;

    boolean rejectSubtypes() default false;
}
