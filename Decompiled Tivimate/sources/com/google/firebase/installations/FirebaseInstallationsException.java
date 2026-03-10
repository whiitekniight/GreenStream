package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import p308.AbstractC4142;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    public FirebaseInstallationsException(String r2) {
        AbstractC4142.m8392(r2, "Detail message must not be empty");
        super(r2);
    }
}
