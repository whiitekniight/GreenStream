package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C0223 extends AbstractC0225 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final UriMatcher f1638 = null;

    static {
        UriMatcher r0 = new UriMatcher(-1);
        f1638 = r0;
        r0.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        r0.addURI("com.android.contacts", "contacts/lookup/*", 1);
        r0.addURI("com.android.contacts", "contacts/#/photo", 2);
        r0.addURI("com.android.contacts", "contacts/#", 3);
        r0.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        r0.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.AbstractC0225
    /* JADX INFO: renamed from: ʼˎ */
    public final Object mo1174(Uri r4, ContentResolver r5) {
        int r0 = f1638.match(r4);
        if (r0 != 1) goto L5;
    L10:
        Uri r02 = ContactsContract.Contacts.lookupContact(r5, r4);
        if (r02 == null) goto L18;
        InputStream r52 = ContactsContract.Contacts.openContactPhotoInputStream(r5, r02, true);
    L13:
        if (r52 == null) goto L16;
        return r52;
    L16:
        throw new FileNotFoundException("InputStream is null for " + r4);
    L18:
        throw new FileNotFoundException("Contact cannot be found");
    L5:
        if (r0 != 3) goto L7;
        r52 = ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, true);
        goto L13
    L7:
        if (r0 == 5) goto L10;
        r52 = r5.openInputStream(r4);
        goto L13
    }

    @Override // com.bumptech.glide.load.data.AbstractC0225
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo1172(Object r1) {
        ((InputStream) r1).close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0220
    /* JADX INFO: renamed from: ﹳٴ */
    public final Class mo1170() {
        return InputStream.class;
    }
}
