package p164;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p398.InterfaceC5098;
import p442.AbstractC5583;

/* JADX INFO: renamed from: ˊʼ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public class C2940 implements Iterator, InterfaceC5098 {

    /* JADX INFO: renamed from: ʽʽ */
    public final Object f10355;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f10356;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f10357;

    public /* synthetic */ C2940(int r1, Object r2) {
        this.f10356 = r1;
        this.f10355 = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f10356) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L10;
            default: goto L5;
        };
    L5:
        if (this.f10357 >= ((AbstractC5583) this.f10355).mo6497()) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.f10357 >= ((LongSparseArray) this.f10355).size()) goto L12;
        return true;
    L12:
        return false;
    L15:
        if (this.f10357 >= ((ViewGroup) this.f10355).getChildCount()) goto L17;
        return true;
    L17:
        return false;
    L20:
        if (this.f10357 >= ((Object[]) this.f10355).length) goto L22;
        return true;
    L22:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f10356) {
            case 0: goto L22;
            case 1: goto L12;
            case 2: goto L10;
            default: goto L5;
        };
    L10:
        LongSparseArray r0 = (LongSparseArray) this.f10355;
        int r1 = this.f10357;
        this.f10357 = r1 + 1;
        return Long.valueOf(r0.keyAt(r1));
    L12:
        ViewGroup r02 = (ViewGroup) this.f10355;
        int r12 = this.f10357;
        this.f10357 = r12 + 1;
        View r03 = r02.getChildAt(r12);
        if (r03 == null) goto L16;
        return r03;
    L16:
        throw new IndexOutOfBoundsException();
    L22:
        Object[] r04 = (Object[]) this.f10355;     // Catch: ArrayIndexOutOfBoundsException -> L19
        int r13 = this.f10357;     // Catch: ArrayIndexOutOfBoundsException -> L19
        this.f10357 = r13 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L19
        return r04[r13];
    L19:
        e = move-exception;
        this.f10357--;
        throw new NoSuchElementException(e.getMessage());
    L5:
        if (hasNext() == false) goto L9;
        AbstractC5583 r05 = (AbstractC5583) this.f10355;
        int r14 = this.f10357;
        this.f10357 = r14 + 1;
        return r05.get(r14);
    L9:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.f10356) {
            case 0: goto L11;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L5;
        };
    L8:
        ViewGroup r0 = (ViewGroup) this.f10355;
        int r1 = this.f10357 - 1;
        this.f10357 = r1;
        r0.removeViewAt(r1);
        return;
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L11:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
