package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p047.AbstractC1703;
import p305.C4137;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: ˈٴ */
    public static final String[] f302 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final HashMap f303 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final File f304 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public C4137 f305;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f306;

    /* JADX INFO: renamed from: ᴵˊ */
    public String f307;

    static {
        f302 = new String[]{"_display_name", "_size"};
        f304 = new File("/");
        f303 = new HashMap();
    }

    public FileProvider() {
        this.f306 = new Object();
    }

    /* JADX INFO: renamed from: ʽ */
    public static C4137 m112(Context r2, String r3) {
        HashMap r0 = f303;
        monitor-enter(r0);
        C4137 r1 = (C4137) r0.get(r3);     // Catch: Throwable -> L8
        if (r1 == null) goto L21;
    L16:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return r1;
    L21:
        r1 = m114(r2, r3);     // Catch: Throwable -> L8 XmlPullParserException -> L10 IOException -> L13
        r0.put(r3, r1);     // Catch: Throwable -> L8
        goto L16
    L13:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L8
    L10:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˈ */
    public static Uri m113(Context r7, String r8, File r9) {
        C4137 r72 = m112(r7, r8);
        String r82 = r9.getCanonicalPath();     // Catch: IOException -> L22
        Iterator r92 = r72.f15257.entrySet().iterator();
        Map.Entry r0 = null;
    L6:
        if (r92.hasNext() == false) goto L13;
        Map.Entry r1 = (Map.Entry) r92.next();
        String r3 = ((File) r1.getValue()).getPath();
        if (m115(r82).startsWith(m115(r3) + '/') == false) goto L6;
        if (r0 == null) goto L12;
        if (r3.length() <= ((File) r0.getValue()).getPath().length()) goto L6;
    L12:
        r0 = r1;
        goto L6
    L13:
        if (r0 == null) goto L21;
        String r93 = ((File) r0.getValue()).getPath();
        if (r93.endsWith("/") == false) goto L17;
        String r83 = r82.substring(r93.length());
    L19:
        return new Uri.Builder().scheme("content").authority(r72.f15258).encodedPath(Uri.encode((String) r0.getKey()) + '/' + Uri.encode(r83, "/")).build();
    L17:
        r83 = r82.substring(r93.length() + 1);
        goto L19
    L21:
        throw new IllegalArgumentException(AbstractC1703.m4482("Failed to find configured root that contains ", r82));
    L23:
        throw new IllegalArgumentException("Failed to resolve canonical path for " + r9);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static C4137 m114(Context r7, String r8) {
        C4137 r0 = new C4137(r8);
        ProviderInfo r1 = r7.getPackageManager().resolveContentProvider(r8, 128);
        if (r1 == null) goto L54;
        XmlResourceParser r82 = r1.loadXmlMetaData(r7.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (r82 == null) goto L52;
    L6:
        int r12 = r82.next();
        if (r12 == 1) goto L50;
        if (r12 != 2) goto L6;
        String r13 = r82.getName();
        File r3 = null;
        String r2 = r82.getAttributeValue(null, "name");
        String r4 = r82.getAttributeValue(null, "path");
        if ("root-path".equals(r13) == false) goto L14;
        r3 = f304;
    L37:
        if (r3 == null) goto L6;
        String r14 = new String[]{r4}[0];
        if (r14 == null) goto L42;
        r3 = new File(r3, r14);
    L42:
        if (TextUtils.isEmpty(r2) == true) goto L49;
        r0.f15257.put(r2, r3.getCanonicalFile());
    L45:
        e = move-exception;
        throw new IllegalArgumentException("Failed to resolve canonical path for " + r3, e);
    L49:
        throw new IllegalArgumentException("Name must not be empty");
    L14:
        if ("files-path".equals(r13) == false) goto L17;
        r3 = r7.getFilesDir();
        goto L37
    L17:
        if ("cache-path".equals(r13) == false) goto L20;
        r3 = r7.getCacheDir();
        goto L37
    L20:
        if ("external-path".equals(r13) == false) goto L23;
        r3 = Environment.getExternalStorageDirectory();
        goto L37
    L23:
        if ("external-files-path".equals(r13) == false) goto L28;
        File[] r15 = r7.getExternalFilesDirs(null);
        if (r15.length <= 0) goto L37;
        r3 = r15[0];
        goto L37
    L28:
        if ("external-cache-path".equals(r13) == false) goto L33;
        File[] r16 = r7.getExternalCacheDirs();
        if (r16.length <= 0) goto L37;
        r3 = r16[0];
        goto L37
    L33:
        if ("external-media-path".equals(r13) == false) goto L37;
        File[] r17 = r7.getExternalMediaDirs();
        if (r17.length <= 0) goto L37;
        r3 = r17[0];
        goto L37
    L50:
        return r0;
    L52:
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    L54:
        throw new IllegalArgumentException(AbstractC1703.m4482("Couldn't find meta-data for provider with authority ", r8));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m115(String r2) {
        if (r2.length() > 0) goto L5;
        return r2;
    L5:
        if (r2.charAt(r2.length() - 1) == '/') goto L7;
        return r2;
    L7:
        return r2.substring(0, r2.length() - 1);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context r2, ProviderInfo r3) {
        super.attachInfo(r2, r3);
        if (r3.exported == true) goto L30;
        if (r3.grantUriPermissions == false) goto L28;
        String r22 = r3.authority;
        if (r22 == null) goto L26;
        if (r22.trim().isEmpty() == true) goto L26;
        String r23 = r3.authority.split(";")[0];
        Object r32 = this.f306;
        monitor-enter(r32);
        this.f307 = r23;     // Catch: Throwable -> L22
        monitor-exit(r32);     // Catch: Throwable -> L22
        HashMap r0 = f303;
        monitor-enter(r0);
        r0.remove(r23);     // Catch: Throwable -> L19
        monitor-exit(r0);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        throw th;
    L22:
        th = move-exception;
        throw th;
    L26:
        throw new SecurityException("Provider must have a non-empty authority");
    L28:
        throw new SecurityException("Provider must grant uri permissions");
    L30:
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        return m116().m8383(r1).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r3) {
        File r32 = m116().m8383(r3);
        int r0 = r32.getName().lastIndexOf(46);
        if (r0 < 0) goto L7;
        String r33 = r32.getName().substring(r0 + 1);
        String r34 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(r33);
        if (r34 == null) goto L9;
        return r34;
    L9:
        return "application/octet-stream";
    L7:
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri r1) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri r2, String r3) {
        File r22 = m116().m8383(r2);
        if ("r".equals(r3) == false) goto L6;
        int r32 = 268435456;
    L23:
        return ParcelFileDescriptor.open(r22, r32);
    L6:
        if ("w".equals(r3) == false) goto L8;
    L21:
        r32 = 738197504;
        goto L23
    L8:
        if ("wt".equals(r3) == true) goto L21;
        if ("wa".equals(r3) == false) goto L14;
        r32 = 704643072;
        goto L23
    L14:
        if ("rw".equals(r3) == false) goto L17;
        r32 = 939524096;
        goto L23
    L17:
        if ("rwt".equals(r3) == false) goto L20;
        r32 = 1006632960;
        goto L23
    L20:
        throw new IllegalArgumentException(AbstractC1703.m4482("Invalid mode: ", r3));
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r8, String[] r9, String r10, String[] r11, String r12) {
        File r102 = m116().m8383(r8);
        String r82 = r8.getQueryParameter("displayName");
        if (r9 != null) goto L5;
        r9 = f302;
    L5:
        String[] r112 = new String[r9.length];
        Object[] r122 = new Object[r9.length];
        int r0 = r9.length;
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r2 >= r0) goto L19;
        String r4 = r9[r2];
        if ("_display_name".equals(r4) == false) goto L16;
        r112[r3] = "_display_name";
        int r42 = r3 + 1;
        if (r82 != null) goto L12;
        String r5 = r102.getName();
    L13:
        r122[r3] = r5;
    L14:
        r3 = r42;
    L18:
        r2 = r2 + 1;
        goto L6
    L12:
        r5 = r82;
        goto L13
    L16:
        if ("_size".equals(r4) == false) goto L18;
        r112[r3] = "_size";
        r42 = r3 + 1;
        r122[r3] = Long.valueOf(r102.length());
        goto L14
    L19:
        String[] r83 = new String[r3];
        System.arraycopy(r112, 0, r83, 0, r3);
        Object[] r92 = new Object[r3];
        System.arraycopy(r122, 0, r92, 0, r3);
        MatrixCursor r103 = new MatrixCursor(r83, 1);
        r103.addRow(r92);
        return r103;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C4137 m116() {
        Object r0 = this.f306;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f307 == null) goto L15;
        if (this.f305 != null) goto L11;
        this.f305 = m112(getContext(), this.f307);     // Catch: Throwable -> L9
    L11:
        C4137 r1 = this.f305;     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r1;
    L15:
        throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");     // Catch: Throwable -> L9
    }
}
