package com.patterns.kodillapatterns2.observer.homework;


public interface QueueObservable {
    void registerQueueObserver(QueueObserver queueObserver);
    void notifyObserver();
}