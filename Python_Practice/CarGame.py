started = False
while True:
    command = input('> ').upper()
    if command == "HELP" :
        print('Start - To start the car ')
        print('Stop - To stop the car ')
        print('Quit - To exit ')
    elif command == "START":
        if started:
            print('Car is already started..')
        else:
            started = True
            print('Car started..Ready to go! ')
    elif command == "STOP":
        if not started:
            print('Car is already stopped.. ')
        else:
            started = False
            print('Car stopped. ')
    elif command == "QUIT":
        break
    else:
        print("Sorry, I don't understand that... ")