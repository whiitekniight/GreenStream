package p266;

import p183.InterfaceC3122;

/* JADX INFO: renamed from: יי.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C3832 {

    /* JADX INFO: renamed from: ʼˎ */
    public boolean f14032;

    /* JADX INFO: renamed from: ʽ */
    public boolean f14033;

    /* JADX INFO: renamed from: ˆʾ */
    public boolean f14034;

    /* JADX INFO: renamed from: ˈ */
    public int f14035;

    /* JADX INFO: renamed from: ˉʿ */
    public boolean f14036;

    /* JADX INFO: renamed from: ˑﹳ */
    public long f14037;

    /* JADX INFO: renamed from: ٴﹶ */
    public long f14038;

    /* JADX INFO: renamed from: ᵎﹶ */
    public boolean f14039;

    /* JADX INFO: renamed from: ᵔᵢ */
    public boolean f14040;

    /* JADX INFO: renamed from: ⁱˊ */
    public long f14041;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC3122 f14042;

    /* JADX INFO: renamed from: ﾞʻ */
    public long f14043;

    /* JADX INFO: renamed from: ﾞᴵ */
    public boolean f14044;

    public C3832(InterfaceC3122 r1) {
        this.f14042 = r1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7875(int r10) {
        long r1 = this.f14043;
        if (r1 == (-9223372036854775807L)) goto L9;
        long r3 = this.f14041;
        long r5 = this.f14038;
        if (r3 == r5) goto L10;
        boolean r32 = this.f14036;
        int r4 = (int) (r3 - r5);
        this.f14042.mo4823(r1, r32 ? 1 : 0, r4, r10, null);
        return;
    L10:
        return;
    }
}
