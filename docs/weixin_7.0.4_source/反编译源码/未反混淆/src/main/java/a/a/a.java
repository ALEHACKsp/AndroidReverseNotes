package a.a;

import a.f.a.b;
import a.f.b.f;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.v;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

@l(dWo = {1, 1, 13}, dWp = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H¦\u0002J\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0014¢\u0006\u0002\u0010\u0014J'\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0012H\u0014¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, dWq = {"Lkotlin/collections/AbstractCollection;", "E", "", "()V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "kotlin-stdlib"})
public abstract class a<E> implements a.f.b.a.a, Collection<E> {

    @l(dWo = {1, 1, 13}, dWp = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, dWq = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"})
    static final class a extends k implements b<E, CharSequence> {
        final /* synthetic */ a AUB;

        a(a aVar) {
            this.AUB = aVar;
            super(1);
        }

        public final /* synthetic */ Object am(Object obj) {
            AppMethodBeat.i(56225);
            CharSequence charSequence;
            if (obj == this.AUB) {
                charSequence = "(this Collection)";
                AppMethodBeat.o(56225);
                return charSequence;
            }
            charSequence = String.valueOf(obj);
            AppMethodBeat.o(56225);
            return charSequence;
        }
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int getSize();

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected a() {
    }

    public final int size() {
        return getSize();
    }

    public boolean contains(Object obj) {
        if (!isEmpty()) {
            for (Object j : this) {
                if (j.j(j, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        j.p(collection, MessengerShareContentUtility.ELEMENTS);
        Iterable<Object> iterable = collection;
        if (!((Collection) iterable).isEmpty()) {
            for (Object contains : iterable) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return t.a((Iterable) this, (CharSequence) ", ", (CharSequence) "[", (CharSequence) "]", 0, null, (b) new a(this), 24);
    }

    public Object[] toArray() {
        return f.j(this);
    }

    public <T> T[] toArray(T[] tArr) {
        j.p(tArr, "array");
        Object[] a = f.a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new v("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
