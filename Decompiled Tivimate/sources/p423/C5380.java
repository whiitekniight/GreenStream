package p423;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ﹳˎ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5380 {

    /* JADX INFO: renamed from: ʽ */
    public static final AtomicLong f19209 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final String f19210 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f19211;

    static {
        f19210 = AbstractC5384.m10418(UUID.randomUUID().toString() + System.currentTimeMillis());
        f19209 = new AtomicLong(0);
    }

    public C5380() {
        long r0 = new Date().getTime();
        ByteBuffer r3 = ByteBuffer.allocate(4);
        r3.putInt((int) (r0 / 1000));
        r3.order(ByteOrder.BIG_ENDIAN);
        r3.position(0);
        byte[] r32 = r3.array();
        byte r5 = r32[0];
        byte r7 = r32[1];
        byte r9 = r32[2];
        byte r33 = r32[3];
        byte[] r02 = m10410(r0 % 1000);
        byte r1 = r02[0];
        byte r03 = r02[1];
        byte[] r11 = m10410(f19209.incrementAndGet());
        byte r12 = r11[0];
        byte r112 = r11[1];
        byte[] r13 = m10410(Integer.valueOf(Process.myPid()).shortValue());
        String r04 = AbstractC5384.m10416(new byte[]{r5, r7, r9, r33, r1, r03, r12, r112, r13[0], r13[1]});
        Locale r14 = Locale.US;
        this.f19211 = String.format(r14, "%s%s%s%s", new Object[]{r04.substring(0, 12), r04.substring(12, 16), r04.subSequence(16, 20), f19210.substring(0, 12)}).toUpperCase(r14);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static byte[] m10410(long r1) {
        ByteBuffer r0 = ByteBuffer.allocate(2);
        r0.putShort((short) r1);
        r0.order(ByteOrder.BIG_ENDIAN);
        r0.position(0);
        return r0.array();
    }

    public final String toString() {
        return this.f19211;
    }
}
