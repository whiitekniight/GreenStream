package p287;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ـﹶ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3989 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ʾˋ */
    public final Class f14765;

    /* JADX INFO: renamed from: ᴵˊ */
    public final ArrayList f14766;

    public C3989(Class r1, CharSequence r2) {
        super(r2);
        this.f14766 = new ArrayList();
        ˉˆ.ﾞᴵ(r1, "watcherClass cannot be null");
        this.f14765 = r1;
    }

    public C3989(Class r1, C3989 r2, int r3, int r4) {
        super(r2, r3, r4);
        this.f14766 = new ArrayList();
        ˉˆ.ﾞᴵ(r1, "watcherClass cannot be null");
        this.f14765 = r1;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence r1, Object r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int r1, int r2) {
        super.delete(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int r1, int r2) {
        super.delete(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object r2) {
        if (m8163(r2) == false) goto L8;
        C3995 r0 = m8162(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        return super.getSpanEnd(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object r2) {
        if (m8163(r2) == false) goto L8;
        C3995 r0 = m8162(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        return super.getSpanFlags(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object r2) {
        if (m8163(r2) == false) goto L8;
        C3995 r0 = m8162(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        return super.getSpanStart(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class r4) {
        if (this.f14765 != r4) goto L10;
        C3995[] r22 = (C3995[]) super.getSpans(r2, r3, C3995.class);
        Object[] r32 = (Object[]) Array.newInstance(r4, r22.length);
        int r42 = 0;
    L6:
        if (r42 >= r22.length) goto L8;
        r32[r42] = r22[r42].f14782;
        r42 = r42 + 1;
        goto L6
    L8:
        return r32;
    L10:
        return super.getSpans(r2, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int r1, CharSequence r2) {
        super.insert(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int r1, CharSequence r2, int r3, int r4) {
        super.insert(r1, r2, r3, r4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int r1, CharSequence r2) {
        super.insert(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int r1, CharSequence r2, int r3, int r4) {
        super.insert(r1, r2, r3, r4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class r4) {
        if (r4 != null) goto L4;
    L5:
        r4 = C3995.class;
    L7:
        return super.nextSpanTransition(r2, r3, r4);
    L4:
        if (this.f14765 != r4) goto L7;
        goto L5
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object r2) {
        if (m8163(r2) == false) goto L7;
        C3995 r0 = m8162(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        super.removeSpan(r2);
        if (r0 == null) goto L12;
        this.f14766.remove(r0);
        return;
    L12:
        return;
    L7:
        r0 = null;
        goto L8
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3) {
        replace(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        replace(r1, r2, r3, r4, r5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r1, int r2, CharSequence r3) {
        m8166();
        super.replace(r1, r2, r3);
        m8164();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        m8166();
        super.replace(r1, r2, r3, r4, r5);
        m8164();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object r2, int r3, int r4, int r5) {
        if (m8163(r2) == false) goto L5;
        C3995 r0 = new C3995(r2);
        this.f14766.add(r0);
        r2 = r0;
    L5:
        super.setSpan(r2, r3, r4, r5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int r3, int r4) {
        return new C3989(this.f14765, this, r3, r4);
    }

    /* JADX INFO: renamed from: ʽ */
    public final C3995 m8162(Object r4) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f14766;
        if (r0 >= r1.size()) goto L9;
        C3995 r12 = (C3995) r1.get(r0);
        if (r12.f14782 == r4) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: ˈ */
    public final boolean m8163(Object r2) {
        if (r2 == null) goto L7;
        Class<?> r22 = r2.getClass();
        if (this.f14765 != r22) goto L9;
        return true;
    L9:
        return false;
    L7:
        return false;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m8164() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f14766;
        if (r0 >= r1.size()) goto L6;
        ((C3995) r1.get(r0)).f14783.decrementAndGet();
        r0 = r0 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m8165() {
        m8164();
        int r1 = 0;
    L3:
        ArrayList r2 = this.f14766;
        if (r1 >= r2.size()) goto L6;
        ((C3995) r2.get(r1)).onTextChanged(this, 0, length(), length());
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m8166() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f14766;
        if (r0 >= r1.size()) goto L6;
        ((C3995) r1.get(r0)).f14783.incrementAndGet();
        r0 = r0 + 1;
        goto L3
    }
}
