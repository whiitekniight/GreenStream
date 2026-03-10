package p274;

import android.content.Context;
import android.content.SharedPreferences;
import p046.InterfaceC1678;
import p374.AbstractC4882;

/* JADX INFO: renamed from: ـʾ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3904 extends AbstractC4882 {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ int f14379;

    /* JADX INFO: renamed from: ˈ */
    public final Context f14380;

    public C3904(Context r3) {
        this.f14379 = 1;
        super(9, 10);
        this.f14380 = r3;
    }

    public C3904(Context r2, int r3, int r4) {
        this.f14379 = 0;
        super(r3, r4);
        this.f14380 = r2;
    }

    @Override // p374.AbstractC4882
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo8026(InterfaceC1678 r13) {
        int r0 = this.f14379;
        Context r3 = this.f14380;
        switch(r0) {
            case 0: goto L29;
            default: goto L4;
        };
    L4:
        r13.mo4421("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences r02 = r3.getSharedPreferences("androidx.work.util.preferences", 0);
        if (r02.contains("reschedule_needed") == false) goto L7;
    L8:
        long r8 = 0;
        long r10 = r02.getLong("last_cancel_all_time_ms", 0);
        if (r02.getBoolean("reschedule_needed", false) == false) goto L11;
        r8 = 1;
    L11:
        r13.mo4422();
        r13.mo4432(new Object[]{"last_cancel_all_time_ms", Long.valueOf(r10)});     // Catch: Throwable -> L25
        r13.mo4432(new Object[]{"reschedule_needed", Long.valueOf(r8)});     // Catch: Throwable -> L25
        r02.edit().clear().apply();     // Catch: Throwable -> L25
        r13.mo4424();     // Catch: Throwable -> L25
        r13.mo4419();
    L14:
        SharedPreferences r03 = r3.getSharedPreferences("androidx.work.util.id", 0);
        if (r03.contains("next_job_scheduler_id") == false) goto L17;
    L18:
        int r2 = r03.getInt("next_job_scheduler_id", 0);
        int r7 = r03.getInt("next_alarm_manager_id", 0);
        r13.mo4422();
        r13.mo4432(new Object[]{"next_job_scheduler_id", Integer.valueOf(r2)});     // Catch: Throwable -> L22
        r13.mo4432(new Object[]{"next_alarm_manager_id", Integer.valueOf(r7)});     // Catch: Throwable -> L22
        r03.edit().clear().apply();     // Catch: Throwable -> L22
        r13.mo4424();     // Catch: Throwable -> L22
        r13.mo4419();
        return;
    L22:
        th = move-exception;
        r13.mo4419();
        throw th;
    L17:
        if (r03.contains("next_job_scheduler_id") == true) goto L18;
        return;
    L25:
        th = move-exception;
        r13.mo4419();
        throw th;
    L7:
        if (r02.contains("last_cancel_all_time_ms") == false) goto L14;
    L29:
        if (this.f17302 < 10) goto L31;
        r13.mo4432(new Object[]{"reschedule_needed", 1});
        return;
    L31:
        r3.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
