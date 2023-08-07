knowledge_base = {
    "printer": {
        "problem": "my printer is not working",
        "solution": "Have you checked that the printer is turnedon and connected to your computer?",},
    "internet": {
        "problem": "i cannot connect to the internet",
        "solution": "Have you tried resetting your modem or router?",},
    "email": {
        "problem": "i cannot send or receive emails",
        "solution": "Have you checked that your email accountsettings are correct?",},
    "password": {
        "problem": "i forgot my password",
        "solution": 'You can reset your password by clicking the "forgot password" link on the login page.',},
    "software": {
        "problem": "my software is not working",
        "solution": "Have you tried reinstalling the software or checking for updates?",},
    "hardware": {
        "problem": "my computer hardware is not working",
        "solution": "Have you checked that all cables are properly connected and all hardware is powered on?",},
    "account": {
        "problem": "i am having trouble accessing my account",
        "solution": "Have you tried resetting your password or contacting customer support?",},
    "website": {
        "problem": "i am having trouble accessing a website",
        "solution": "Have you tried clearing your browser cache or using a different browser?",},
    "computer": {
        "problem": "my computer is running slowly",
        "solution": "Your PC might also be slow because of viruses and malware. Therefore, ensure that you disconnect your PC from the network and let the IT help desk sort it out for you.",},
}
def help_desk_expert_system():
    user_input = input("What seems to be the problem? ")
    for topic, data in knowledge_base.items():
        if user_input.lower() in data["problem"]:
            print(data["solution"])
            
            return
    print("I'm sorry, I don't understand the problem.")
run = True
while run:
    help_desk_expert_system()
    more_question = input("Do you have more questions(Yes | No):").lower()
    if more_question == "yes":
        help_desk_expert_system()
        run = True
       
    else:
        print("Thank You")
        run = False
        