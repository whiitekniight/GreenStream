package androidx.datastore.core;

/* JADX INFO: loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int r1);

    public final native int nativeGetCounterValue(long r1);

    public final native int nativeIncrementAndGetCounterValue(long r1);

    public final native int nativeTruncateFile(int r1);
}
