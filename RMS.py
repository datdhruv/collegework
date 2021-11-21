'''
Rate Monotonic Scheduler Implementation in python

Insert inputs as [period, cpu burst time(in unit time(may be ms/ns/secs))]
'''

''' 
Elements are:
    1. A Ready Queue
    2. time.sleep() to simulate the timer 
'''
from time import sleep

task_list = [(3, 10), (4, 15)]

ready_queue = []
ready_queue.append("task_1")
ready_queue.append("task_2")

while True:
    sleep(1)
        
    if ready_queue == []:
        continue

    task_list.pop(0)       