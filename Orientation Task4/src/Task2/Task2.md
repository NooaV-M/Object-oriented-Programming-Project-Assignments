## Updated On Events

A: Arrival count <br>
Arrival count is incremented immediately when an arrival event is reached in the queue and a new client is placed into a queue.

C: Completion count <br>
Completion count is incremented immediately when a service completion event is reached in the queue and a client departs from the system.

<br>

## Updated Continuously

T: Total time observed <br>
Total time observed is updated continuously as time progresses in the simulation.

<br>

## Updated On Calculating after Events

Ri: Response time <br>
Time a client spends in the system (from arrival to departure) is updated when a client departs from the system. It is calculated as the difference between the departure time and the arrival time of the client.

B: Busy time <br>
Total time service providers are busy delivering service. It is updated when a service completion event occurs, adding the service time of the completed client to the busy time.

W: Waiting time <br>
Total time clients spend waiting before service. It is updated when a client begins service, adding the waiting time of the client (the difference between the start of service time and arrival time) to the waiting time.

<br>

## Calculated at the End of Simulation

U: Utilization rate of service providers = B / T <br>
Calculated at the end of the simulation when total time is no longer incremented to assess how effectively service providers' time was used.

X: Throughput rate = C / T <br>
Calculated at the end of the simulation to evaluate how many clients were served per unit of time.

S: Average service time per client = B / C <br>
Calculated at the end of the simulation to determine the average time spent servicing each client.

R: Average response time per client = Ri / A <br>
Calculated at the end of the simulation to measure how long, on average, a client spent in the system.