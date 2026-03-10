package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p224.C3477;
import ﹳˋ.ٴﹶ;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public FirebaseCommonLegacyRegistrar() {
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3477> getComponents() {
        return Collections.singletonList(ٴﹶ.ʼˎ("fire-core-ktx", "21.0.0"));
    }
}
