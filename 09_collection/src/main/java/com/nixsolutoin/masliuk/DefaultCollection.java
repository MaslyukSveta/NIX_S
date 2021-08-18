package com.nixsolutoin.masliuk;


import java.util.Collection;

public interface DefaultCollection<E> extends Collection<E> {

    @Override
    DefaultIterator<E> iterator();
}