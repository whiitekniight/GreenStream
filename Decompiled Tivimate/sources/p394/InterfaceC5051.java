package p394;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: ⁱʻ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC5051 {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
