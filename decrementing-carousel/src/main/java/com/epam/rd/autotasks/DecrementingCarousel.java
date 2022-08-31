package com.epam.rd.autotasks;

public class DecrementingCarousel {
    public int capacity;
    public int maxIndex = 0;
    public int[] array;
    private boolean run = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    public boolean addElement(int element){
        if(element <= 0 || maxIndex == capacity) {
            return false;
        }
        if (!run) {
            this.array[this.maxIndex] = element;
            this.maxIndex++;
        }
        return !run;
    }

    public CarouselRun run(){
        if (run) {
            return null;
        } else {
            CarouselRun cr = new CarouselRun(this);
            run = true;
            return cr;
        }
    }
}
