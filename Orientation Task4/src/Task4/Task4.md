eventlist = new eventlist();

clock = new clock();

clock.time(0);

eventlist.(generateArrivalEvent(clock.getTime));

while(true){

    // A phase 1: Get next event

    nextEvent = eventlist.getNextEvent();
    clock.time(nextEvent.time);

    // B phase 2: Process event

    while(eventlist.hasEventAtTime(clock.getTime())){
        currentEvent = eventlist.getNextEventAtTime(clock.getTime());
        currentEvent.process(eventlist, clock.getTime);
    }

    // C phase 3: Calculate new event(s)

    while(users waiting > 0 && serversAvailable > 0){
        eventlist.addEvent(generateCompletionEvent(clock.getTime));
        usersWaiting = usersWaiting - 1;
        serversAvailable = serversAvailable - 1;
    }

}

statistics = getStatistics();
print(statistics);