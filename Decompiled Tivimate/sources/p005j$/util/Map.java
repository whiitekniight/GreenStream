package p005j$.util;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public interface Map<K, V> {

    /* JADX INFO: renamed from: j$.util.Map$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$compute(java.util.Map r1, Object r2, BiFunction r3) {
            Objects.requireNonNull(r3);
            Object r0 = r1.get(r2);
            Object r32 = r3.apply(r2, r0);
            if (r32 == null) goto L5;
            r1.put(r2, r32);
            return r32;
        L5:
            if (r0 == null) goto L7;
        L10:
            r1.remove(r2);
            return null;
        L7:
            if (r1.containsKey(r2) == true) goto L10;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.Map r1, Object r2, Function r3) {
            Objects.requireNonNull(r3);
            Object r0 = r1.get(r2);
            if (r0 != null) goto L8;
            Object r32 = r3.apply(r2);
            if (r32 == null) goto L8;
            r1.put(r2, r32);
            return r32;
        L8:
            return r0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.Map r2, Object r3, BiFunction r4) {
            Objects.requireNonNull(r4);
            Object r0 = r2.get(r3);
            if (r0 == null) goto L9;
            Object r42 = r4.apply(r3, r0);
            if (r42 == null) goto L8;
            r2.put(r3, r42);
            return r42;
        L8:
            r2.remove(r3);
        L9:
            return null;
        }

        public static void $default$forEach(java.util.Map r2, BiConsumer r3) {
            Objects.requireNonNull(r3);
            Iterator<Map.Entry<K, V>> r22 = r2.entrySet().iterator();
        L4:
            if (r22.hasNext() == false) goto L11;
            Map.Entry<K, V> r0 = r22.next();
            r3.accept(r0.getKey(), r0.getValue());
        L8:
            e = move-exception;
            throw new ConcurrentModificationException(e);
        }

        public static Object $default$getOrDefault(java.util.Map r1, Object r2, Object r3) {
            Object r0 = r1.get(r2);
            if (r0 == null) goto L5;
        L8:
            return r0;
        L5:
            if (r1.containsKey(r2) == true) goto L8;
            return r3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.Map r1, Object r2, Object r3, BiFunction r4) {
            Objects.requireNonNull(r4);
            Objects.requireNonNull(r3);
            Object r0 = r1.get(r2);
            if (r0 == null) goto L6;
            r3 = r4.apply(r0, r3);
        L6:
            if (r3 != null) goto L9;
            r1.remove(r2);
            return r3;
        L9:
            r1.put(r2, r3);
            return r3;
        }

        public static Object $default$putIfAbsent(java.util.Map r1, Object r2, Object r3) {
            Object r0 = r1.get(r2);
            if (r0 == null) goto L5;
            return r0;
        L5:
            return r1.put(r2, r3);
        }

        public static boolean $default$remove(java.util.Map r1, Object r2, Object r3) {
            Object r0 = r1.get(r2);
            if (Objects.equals(r0, r3) == false) goto L10;
            if (r0 == null) goto L6;
        L8:
            r1.remove(r2);
            return true;
        L6:
            if (r1.containsKey(r2) == true) goto L8;
            return false;
        L10:
            return false;
        }

        public static Object $default$replace(java.util.Map r2, Object r3, Object r4) {
            Object r0 = r2.get(r3);
            if (r0 != null) goto L9;
            if (r2.containsKey(r3) == true) goto L9;
            return r0;
        L9:
            return r2.put(r3, r4);
        }

        public static boolean $default$replace(java.util.Map r1, Object r2, Object r3, Object r4) {
            Object r0 = r1.get(r2);
            if (Objects.equals(r0, r3) == false) goto L10;
            if (r0 == null) goto L6;
        L8:
            r1.put(r2, r4);
            return true;
        L6:
            if (r1.containsKey(r2) == true) goto L8;
            return false;
        L10:
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$replaceAll(java.util.Map r3, BiFunction r4) {
            Objects.requireNonNull(r4);
            Iterator<Map.Entry<K, V>> r32 = r3.entrySet().iterator();
        L4:
            if (r32.hasNext() == false) goto L16;
            Map.Entry<K, V> r0 = r32.next();
            r0.setValue(r4.apply(r0.getKey(), r0.getValue()));     // Catch: IllegalStateException -> L10
        L10:
            e = move-exception;
            throw new ConcurrentModificationException(e);
        L13:
            e = move-exception;
            throw new ConcurrentModificationException(e);
        }
    }

    V compute(K r1, BiFunction<? super K, ? super V, ? extends V> r2);

    V computeIfAbsent(K r1, Function<? super K, ? extends V> r2);

    V computeIfPresent(K r1, BiFunction<? super K, ? super V, ? extends V> r2);

    void forEach(BiConsumer<? super K, ? super V> r1);

    V getOrDefault(Object r1, V r2);

    V merge(K r1, V r2, BiFunction<? super V, ? super V, ? extends V> r3);

    V putIfAbsent(K r1, V r2);

    boolean remove(Object r1, Object r2);

    V replace(K r1, V r2);

    boolean replace(K r1, V r2, V r3);

    void replaceAll(BiFunction<? super K, ? super V, ? extends V> r1);
}
