package com.smeup.tutorial.soap;

import java.util.function.Supplier;

public class NotFoundExceptionSupplier implements Supplier<NotFoundException> {

    private final String msg;

    public NotFoundExceptionSupplier(final String msg) {

        this.msg = msg;
    }

    @Override
    public NotFoundException get() {
        return new NotFoundException(this.msg);
    }

}
