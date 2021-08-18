package com.nixsolutoin.masliuk;


import java.util.*;

public class Array implements DefaultCollection {

    /**
     * Shared empty array instance used for default sized empty instances.
     * We distinguish this from EMPTY_ELEMENTDATA to know how much to inflate
     * when first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * The array buffer into which the elements of the ArrayList are stored.
     * The capacity of the ArrayList is the length of this array buffer.
     * Any empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
     * will be expanded to DEFAULT_CAPACITY when the first element is added.
     */
    transient Object[] elementData;
    /**
     * The size of the ArrayList (the number of elements it contains).
     */
    private int size;
    private int modCount;


    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public Array() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns true if this list contains the specified element.
     * More formally, returns true if and only if this list contains
     * at least one element e such that Objects.equals(o, e).
     *
     * @param o – element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element. More formally,
     * returns the lowest index i such that Objects.equals(o, get(i)),
     * or -1 if there is no such index.
     *
     * @param o
     * @returnhe index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     */
    private int indexOf(Object o) {
        return indexOfRange(o, 0, size);
    }

    int indexOfRange(Object o, int start, int end) {
        Object[] es = elementData;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    @Override
    public DefaultIterator iterator() {
        return new Iterator();
    }

    /**
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     * The returned array will be "safe" in that no references to it are maintained by this list. (In other words,
     * this method must allocate a new array). The caller is thus free to modify the returned array.
     * This method acts as bridge between array-based and collection-based APIs.
     *
     * @return an array containing all of the elements in this list in proper sequence
     */
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    /**
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.
     * If the list fits in the specified array with room to spare (i.e., the array has more elements than the list), the element in the array immediately following the end of the collection is set to null. (This is useful in determining the length of the list only if the caller knows that the list does not contain any null elements.)
     *
     * @param a the array into which the elements of the list are to be stored,
     *          if it is big enough; otherwise, a new array of the same runtime type is allocated for this purpose.
     * @return an array containing the elements of the list.
     */
    @Override
    public Object[] toArray(Object[] a) {
        if (a.length < size)
            // Make a new array of a runtime type, but my contents:
            return (Object[]) Arrays.copyOf(elementData, size, a.getClass());
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param o element to be appended to this list
     * @return true (as specified by Collection.add)
     */
    @Override
    public boolean add(Object o) {
        modCount++;
        add(o, elementData, size);
        return true;
    }

    private void add(Object o, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData = grow();
        elementData[s] = o;
        size = s + 1;
    }

    private void fastRemove(Object[] es, int i) {
        modCount++;
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }

    @Override
    public boolean remove(Object o) {
        final Object[] es = elementData;
        final int size = this.size;
        int i = 0;
        found:
        {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }
            return false;
        }
        fastRemove(es, i);
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] a = c.toArray();
        modCount++;
        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] elementData;
        final int s;
        if (numNew > (elementData = this.elementData).length - (s = size))
            elementData = grow(s + numNew);
        System.arraycopy(a, 0, elementData, s, numNew);
        size = s + numNew;
        return true;


    }

    private Object[] grow(int minCapacity) {
        return null;

    }

    private Object[] grow() {
        return grow(size + 1);
    }


    @Override
    public void clear() {
        modCount++;
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

    /**
     * Retains only the elements in this list that are contained in the specified collection.
     * In other words, removes from this list all of its elements that are not contained in the specified collection.
     *
     * @param c – collection containing elements to be retained in this list
     * @return
     */
    @Override
    public boolean retainAll(Collection c) {
        return batchRemove(c, true, 0, size);
    }

    /**
     * Removes from this list all of its elements that are contained in the specified collection.
     *
     * @param c – collection containing elements to be removed from this list
     * @return
     */
    @Override
    public boolean removeAll(Collection c) {
        return batchRemove(c, false, 0, size);

    }

    /**
     * Retains only the elements in this list that are contained in the specified collection.
     * In other words, removes from this list all of its elements that are not contained in the specified collection.
     *
     * @param c – collection containing elements to be retained in this list
     * @return true if this list changed as a result of the call
     */
    private boolean batchRemove(Collection c, boolean complement, int from, int end) {
        Objects.requireNonNull(c);
        final Object[] es = elementData;
        int r;
        // Optimize for initial run of survivors
        for (r = from; ; r++) {
            if (r == end)
                return false;
            if (c.contains(es[r]) != complement)
                break;
        }
        int w = r++;
        try {
            for (Object e; r < end; r++)
                if (c.contains(e = es[r]) == complement)
                    es[w++] = e;
        } catch (Throwable ex) {
            // Preserve behavioral compatibility with AbstractCollection,
            // even if c.contains() throws.
            System.arraycopy(es, r, es, w, end - r);
            w += end - r;
            throw ex;
        } finally {
            modCount += end - w;
            shiftTailOverGap(es, w, end);
        }
        return true;
    }

    private void shiftTailOverGap(Object[] es, int lo, int hi) {
        System.arraycopy(es, hi, es, lo, size - hi);
        for (int to = size, i = (size -= hi - lo); i < to; i++)
            es[i] = null;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }


    class Iterator implements DefaultIterator {

        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such
        int expectedModCount = modCount;

        // prevent creating a synthetic constructor
        Iterator() {
        }


        final void checkForCommodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public Object next() {
            checkForCommodification();
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = Array.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (Object) elementData[lastRet = i];

        }
    }
}
