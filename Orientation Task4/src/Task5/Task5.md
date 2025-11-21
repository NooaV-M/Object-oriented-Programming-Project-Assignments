## A-Phase

Get the next event chronologically from the event list and advance the simulation clock to that event's time.

## B-Phase

Process all events scheduled for the current simulation time. This may involve handling arrivals, completions, or other event types defined in the simulation.

## C-Phase

After processing events, check if there are users waiting and available servers. If so, schedule new completion events for those users, updating the counts of waiting users and available servers accordingly.
Create next event(s) based on the current state of the system.