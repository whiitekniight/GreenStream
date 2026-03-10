package p317;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import p022.AbstractC1327;
import p287.ThreadFactoryC4006;
import p319.AbstractC4223;
import p404.C5158;

/* JADX INFO: renamed from: ᐧˎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4214 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Object f15469 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static ExecutorService f15470;

    static {
        f15469 = new Object();
    }

    /* JADX INFO: renamed from: ʻٴ */
    public static boolean m8550(XmlPullParser r2, String r3) {
        if (r2.getEventType() == 3) goto L5;
        return false;
    L5:
        if (r2.getName().equals(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: ʼʼ */
    public static void m8551(MediaFormat r1, String r2, int r3) {
        if (r3 == (-1)) goto L6;
        r1.setInteger(r2, r3);
        return;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static void m8552(C5158 r0) {
        r0.getClass();
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public static void m8553(String r2, String r3) {
        Object r0 = f15469;
        monitor-enter(r0);
        m8577(r3, null);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m8554(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r0));
    }

    /* JADX INFO: renamed from: ʽʽ */
    public static void m8555(MediaFormat r3, List r4) {
        int r0 = 0;
    L4:
        if (r0 >= r4.size()) goto L6;
        r3.setByteBuffer(AbstractC4223.m8643(r0, "csd-"), ByteBuffer.wrap((byte[]) r4.get(r0)));
        r0 = r0 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: ʽﹳ */
    public static void m8556(String r2, String r3) {
        Object r0 = f15469;
        monitor-enter(r0);
        m8577(r3, null);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ʾˋ */
    public static String m8557(String r10, String r11) {
        StringBuilder r0 = new StringBuilder();
        if (r10 != null) goto L5;
        r10 = "";
    L5:
        if (r11 != null) goto L7;
        r11 = "";
    L7:
        int[] r1 = m8564(r11);
        if (r1[0] == (-1)) goto L11;
        r0.append(r11);
        m8575(r0, r1[1], r1[2]);
        return r0.toString();
    L11:
        int[] r3 = m8564(r10);
        if (r1[3] != 0) goto L16;
        r0.append(r10, 0, r3[3]);
        r0.append(r11);
        return r0.toString();
    L16:
        if (r1[2] != 0) goto L19;
        r0.append(r10, 0, r3[2]);
        r0.append(r11);
        return r0.toString();
    L19:
        int r7 = r1[1];
        if (r7 == 0) goto L24;
        int r32 = r3[0] + 1;
        r0.append(r10, 0, r32);
        r0.append(r11);
        return m8575(r0, r1[1] + r32, r32 + r1[2]);
    L24:
        if (r11.charAt(r7) != '/') goto L27;
        r0.append(r10, 0, r3[1]);
        r0.append(r11);
        int r102 = r3[1];
        return m8575(r0, r102, r1[2] + r102);
    L27:
        int r72 = r3[0] + 2;
        int r9 = r3[1];
        if (r72 < r9) goto L30;
    L33:
        int r73 = r10.lastIndexOf(47, r3[2] - 1);
        if (r73 != (-1)) goto L36;
        int r4 = r3[1];
    L37:
        r0.append(r10, 0, r4);
        r0.append(r11);
        return m8575(r0, r3[1], r4 + r1[2]);
    L36:
        r4 = r73 + 1;
        goto L37
    L30:
        if (r9 != r3[2]) goto L33;
        r0.append(r10, 0, r9);
        r0.append('/');
        r0.append(r11);
        int r103 = r3[1];
        return m8575(r0, r103, (r1[2] + r103) + 1);
    }

    /* JADX INFO: renamed from: ʾᵎ */
    public static boolean m8558(XmlPullParser r2, String r3) {
        if (r2.getEventType() == 2) goto L5;
        return false;
    L5:
        if (r2.getName().equals(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static void m8559(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.valueOf(r0));
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m8560(boolean r0) {
        if (r0 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ˈٴ */
    public static void m8561(String r2, String r3) {
        Object r0 = f15469;
        monitor-enter(r0);
        m8577(r3, null);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public static void m8562(Object r0, String r1) {
        if (r0 == null) goto L5;
        return;
    L5:
        throw new IllegalStateException(r1);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static void m8563(String r2, String r3) {
        Object r0 = f15469;
        monitor-enter(r0);
        m8577(r3, null);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˏי */
    public static int[] m8564(String r9) {
        int[] r0 = new int[4];
        if (TextUtils.isEmpty(r9) == false) goto L6;
        r0[0] = -1;
        return r0;
    L6:
        int r1 = r9.length();
        int r4 = r9.indexOf(35);
        if (r4 == (-1)) goto L10;
        r1 = r4;
    L10:
        int r42 = r9.indexOf(63);
        if (r42 == (-1)) goto L13;
        if (r42 > r1) goto L13;
    L14:
        int r6 = r9.indexOf(47);
        if (r6 == (-1)) goto L17;
        if (r6 > r42) goto L17;
    L18:
        int r7 = r9.indexOf(58);
        if (r7 <= r6) goto L21;
        r7 = -1;
    L21:
        int r62 = r7 + 2;
        if (r62 < r42) goto L24;
    L31:
        int r92 = r7 + 1;
    L32:
        r0[0] = r7;
        r0[1] = r92;
        r0[2] = r42;
        r0[3] = r1;
        return r0;
    L24:
        if (r9.charAt(r7 + 1) != '/') goto L31;
        if (r9.charAt(r62) != '/') goto L31;
        r92 = r9.indexOf(47, r7 + 3);
        if (r92 == (-1)) goto L30;
        if (r92 <= r42) goto L32;
    L30:
        r92 = r42;
    L17:
        r6 = r42;
    L13:
        r42 = r1;
        goto L14
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m8565() {
        StringBuilder r0 = new StringBuilder();
        boolean r1 = false;
    L3:
        int r2 = GLES20.glGetError();
        if (r2 == 0) goto L11;
        if (r1 == false) goto L7;
        r0.append('\n');
    L7:
        String r12 = GLU.gluErrorString(r2);
        if (r12 != null) goto L10;
        r12 = "error code: 0x" + Integer.toHexString(r2);
    L10:
        r0.append("glError: ");
        r0.append(r12);
        r1 = true;
        goto L3
    L11:
        if (r1 == true) goto L14;
        return;
    L14:
        throw new GlUtil$GlException(r0.toString());
    }

    /* JADX INFO: renamed from: יـ */
    public static String m8566(XmlPullParser r3, String r4) {
        int r0 = r3.getAttributeCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        if (r3.getAttributeName(r1).equals(r4) == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return r3.getAttributeValue(r1);
    L9:
        return null;
    }

    /* JADX INFO: renamed from: ـˆ */
    public static boolean m8567(String r5) {
        EGLDisplay r1 = EGL14.eglGetDisplay(0);
        m8580("No EGL display.", !r1.equals(EGL14.EGL_NO_DISPLAY));
        m8580("Error in eglInitialize.", EGL14.eglInitialize(r1, new int[1], 0, new int[1], 0));
        m8565();
        String r12 = EGL14.eglQueryString(r1, 12373);
        if (r12 != null) goto L5;
    L7:
        return false;
    L5:
        if (r12.contains(r5) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public static void m8568(boolean r0) {
        if (r0 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᴵˊ */
    public static Uri m8569(String r0, String r1) {
        return Uri.parse(m8557(r0, r1));
    }

    /* JADX INFO: renamed from: ᴵᵔ */
    public static void m8570(String r1, String r2, Throwable r3) {
        Object r0 = f15469;
        monitor-enter(r0);
        m8577(r2, r3);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static void m8571(int r0, int r1) {
        if (r0 < 0) goto L6;
        if (r0 >= r1) goto L6;
        return;
    L6:
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static FloatBuffer m8572(float[] r2) {
        return (FloatBuffer) ByteBuffer.allocateDirect(r2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(r2).flip();
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static void m8573(Object r0, String r1) {
        if (r0 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r1);
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public static void m8574(String r1, String r2, Throwable r3) {
        Object r0 = f15469;
        monitor-enter(r0);
        m8577(r2, r3);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ᵢˏ */
    public static String m8575(StringBuilder r7, int r8, int r9) {
        if (r8 < r9) goto L6;
        return r7.toString();
    L6:
        if (r7.charAt(r8) != '/') goto L8;
        r8 = r8 + 1;
    L8:
        int r0 = r8;
        int r2 = r0;
    L9:
        if (r0 > r9) goto L36;
        if (r0 == r9) goto L11;
        if (r7.charAt(r0) == '/') goto L14;
        r0 = r0 + 1;
        goto L9
    L14:
        int r3 = r0 + 1;
    L15:
        int r4 = r2 + 1;
        if (r0 != r4) goto L21;
        if (r7.charAt(r2) != '.') goto L21;
        r7.delete(r2, r3);
        r9 = r9 - (r3 - r2);
    L33:
        r0 = r2;
    L21:
        if (r0 == (r2 + 2)) goto L23;
    L32:
        int r02 = r0 + 1;
    L31:
        r2 = r02;
        goto L33
    L23:
        if (r7.charAt(r2) != '.') goto L32;
        if (r7.charAt(r4) != '.') goto L32;
        r02 = r7.lastIndexOf("/", r2 - 2) + 1;
        if (r02 <= r8) goto L29;
        int r22 = r02;
    L30:
        r7.delete(r22, r3);
        r9 = r9 - (r3 - r22);
        goto L31
    L29:
        r22 = r8;
        goto L30
    L11:
        r3 = r0;
        goto L15
    L36:
        return r7.toString();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m8576(int r1, int r2) {
        GLES20.glBindTexture(r1, r2);
        m8565();
        GLES20.glTexParameteri(r1, 10240, 9729);
        m8565();
        GLES20.glTexParameteri(r1, 10241, 9729);
        m8565();
        GLES20.glTexParameteri(r1, 10242, 33071);
        m8565();
        GLES20.glTexParameteri(r1, 10243, 33071);
        m8565();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m8577(String r3, Throwable r4) {
        if (r4 != null) goto L4;
        String r42 = null;
    L19:
        if (TextUtils.isEmpty(r42) == true) goto L27;
        StringBuilder r32 = AbstractC1327.m3728(r3, "\n  ");
        r32.append(r42.replace("\n", "\n  "));
        r32.append('\n');
        return r32.toString();
    L27:
        return r3;
    L4:
        Object r0 = f15469;
        monitor-enter(r0);
        Throwable r1 = r4;
    L7:
        if (r1 == null) goto L16;
    L13:
        th = move-exception;
        throw th;
    L9:
        if ((r1 instanceof UnknownHostException) == true) goto L10;
        r1 = r1.getCause();     // Catch: Throwable -> L13
        goto L7
    L10:
        r42 = "UnknownHostException (no network)";
        monitor-exit(r0);     // Catch: Throwable -> L13
        goto L19
    L16:
        r42 = Log.getStackTraceString(r4).trim().replace("\t", "    ");     // Catch: Throwable -> L13
        monitor-exit(r0);     // Catch: Throwable -> L13
        goto L19
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public static synchronized Executor m8578() {
        monitor-enter(AbstractC4214.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f15470 != null) goto L9;
        String r2 = AbstractC4195.f15423;     // Catch: Throwable -> L7
        f15470 = Executors.newSingleThreadExecutor(new ThreadFactoryC4006(1, "ExoPlayer:BackgroundExecutor"));     // Catch: Throwable -> L7
    L9:
        ExecutorService r1 = f15470;     // Catch: Throwable -> L7
        monitor-exit(AbstractC4214.class);
        return r1;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static void m8579(Object r0) {
        if (r0 == null) goto L5;
        return;
    L5:
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m8580(String r0, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new GlUtil$GlException(r0);
    }
}
