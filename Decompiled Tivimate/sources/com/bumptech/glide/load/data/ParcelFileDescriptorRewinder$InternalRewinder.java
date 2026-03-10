package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: ﹳٴ */
    public final ParcelFileDescriptor f1624;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor r1) {
        this.f1624 = r1;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor r0 = this.f1624;
        Os.lseek(r0.getFileDescriptor(), 0, OsConstants.SEEK_SET);     // Catch: ErrnoException -> L5
        return r0;
    L5:
        e = move-exception;
        throw new IOException(e);
    }
}
