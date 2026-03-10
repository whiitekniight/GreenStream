package p411;

/* JADX INFO: renamed from: ⁱⁱ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5236 implements InterfaceC5232, InterfaceC5231 {

    /* JADX INFO: renamed from: ʽ */
    public volatile InterfaceC5231 f18887;

    /* JADX INFO: renamed from: ˈ */
    public volatile InterfaceC5231 f18888;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f18889;

    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC5232 f18890;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f18891;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f18892;

    public C5236(Object r2, InterfaceC5232 r3) {
        this.f18889 = 3;
        this.f18892 = 3;
        this.f18891 = r2;
        this.f18890 = r3;
    }

    @Override // p411.InterfaceC5231
    public final void clear() {
        Object r0 = this.f18891;
        monitor-enter(r0);
        this.f18889 = 3;     // Catch: Throwable -> L8
        this.f18887.clear();     // Catch: Throwable -> L8
        if (this.f18892 == 3) goto L10;
        this.f18892 = 3;     // Catch: Throwable -> L8
        this.f18888.clear();     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // p411.InterfaceC5232
    public final InterfaceC5232 getRoot() {
        Object r0 = this.f18891;
        monitor-enter(r0);
        InterfaceC5232 r1 = this.f18890;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        InterfaceC5232 r12 = r1.getRoot();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r12;
    L9:
        r12 = this;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p411.InterfaceC5231
    public final boolean isRunning() {
        Object r0 = this.f18891;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.f18889 != 1) goto L7;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        if (this.f18892 == 1) goto L12;
        r2 = false;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // p411.InterfaceC5232
    /* JADX INFO: renamed from: ʼˎ */
    public final boolean mo10206(InterfaceC5231 r2) {
        Object r22 = this.f18891;
        monitor-enter(r22);
        InterfaceC5232 r0 = this.f18890;     // Catch: Throwable -> L13
        if (r0 != null) goto L7;
    L10:
        boolean r02 = true;
    L11:
        monitor-exit(r22);     // Catch: Throwable -> L13
        return r02;
    L7:
        if (r0.mo10206(this) == true) goto L10;
        r02 = false;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // p411.InterfaceC5232
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo10207(InterfaceC5231 r6) {
        Object r0 = this.f18891;
        monitor-enter(r0);
        InterfaceC5232 r1 = this.f18890;     // Catch: Throwable -> L22
        boolean r2 = false;
        if (r1 == null) goto L9;
        if (r1.mo10207(this) == true) goto L9;
    L20:
        monitor-exit(r0);     // Catch: Throwable -> L22
        return r2;
    L9:
        if (this.f18889 == 5) goto L12;
        boolean r62 = r6.equals(this.f18887);     // Catch: Throwable -> L22
    L18:
        if (r62 == false) goto L20;
        r2 = true;
        goto L20
    L12:
        if (r6.equals(this.f18888) == false) goto L17;
        int r63 = this.f18892;     // Catch: Throwable -> L22
        if (r63 == 4) goto L16;
        if (r63 != 5) goto L17;
    L16:
        r62 = true;
    L17:
        r62 = false;
    L22:
        th = move-exception;
        throw th;
    }

    @Override // p411.InterfaceC5232
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo10208(InterfaceC5231 r3) {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.equals(this.f18888) == true) goto L13;
        this.f18889 = 5;     // Catch: Throwable -> L9
        if (this.f18892 == 1) goto L11;
        this.f18892 = 1;     // Catch: Throwable -> L9
        this.f18888.mo10205();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L13:
        this.f18892 = 5;     // Catch: Throwable -> L9
        InterfaceC5232 r32 = this.f18890;     // Catch: Throwable -> L9
        if (r32 == null) goto L16;
        r32.mo10208(this);     // Catch: Throwable -> L9
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L9
    }

    @Override // p411.InterfaceC5231
    /* JADX INFO: renamed from: ˈ */
    public final void mo10200() {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f18889 != 1) goto L10;
        this.f18889 = 2;     // Catch: Throwable -> L7
        this.f18887.mo10200();     // Catch: Throwable -> L7
    L10:
        if (this.f18892 != 1) goto L12;
        this.f18892 = 2;     // Catch: Throwable -> L7
        this.f18888.mo10200();     // Catch: Throwable -> L7
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // p411.InterfaceC5231
    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean mo10201() {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f18889 == 3) goto L7;
    L11:
        boolean r1 = false;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r1;
    L7:
        if (this.f18892 != 3) goto L11;
        r1 = true;
        goto L12
    }

    @Override // p411.InterfaceC5232
    /* JADX INFO: renamed from: ٴﹶ */
    public final boolean mo10209(InterfaceC5231 r3) {
        Object r0 = this.f18891;
        monitor-enter(r0);
        InterfaceC5232 r1 = this.f18890;     // Catch: Throwable -> L14
        if (r1 == null) goto L9;
        if (r1.mo10209(this) == true) goto L9;
    L11:
        boolean r32 = false;
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L14
        return r32;
    L9:
        if (r3.equals(this.f18887) == false) goto L11;
        r32 = true;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // p411.InterfaceC5231
    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean mo10202(InterfaceC5231 r4) {
        if ((r4 instanceof C5236) == false) goto L10;
        C5236 r42 = (C5236) r4;
        if (this.f18887.mo10202(r42.f18887) == false) goto L10;
        if (this.f18888.mo10202(r42.f18888) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p411.InterfaceC5231
    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean mo10203() {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f18889 != 4) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.f18892 == 4) goto L12;
        r1 = false;
        goto L13
    }

    @Override // p411.InterfaceC5232
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo10210(InterfaceC5231 r4) {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r4.equals(this.f18887) == false) goto L10;
        this.f18889 = 4;     // Catch: Throwable -> L7
    L12:
        InterfaceC5232 r42 = this.f18890;     // Catch: Throwable -> L7
        if (r42 == null) goto L15;
        r42.mo10210(this);     // Catch: Throwable -> L7
    L15:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L10:
        if (r4.equals(this.f18888) == false) goto L12;
        this.f18892 = 4;     // Catch: Throwable -> L7
        goto L12
    }

    @Override // p411.InterfaceC5232, p411.InterfaceC5231
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo10204() {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f18887.mo10204() == false) goto L7;
    L12:
        boolean r1 = true;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        if (this.f18888.mo10204() == true) goto L12;
        r1 = false;
        goto L13
    }

    @Override // p411.InterfaceC5231
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo10205() {
        Object r0 = this.f18891;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f18889 == 1) goto L9;
        this.f18889 = 1;     // Catch: Throwable -> L7
        this.f18887.mo10205();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }
}
