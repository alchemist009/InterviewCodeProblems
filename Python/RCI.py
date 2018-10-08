def solutions(S, K):

    S = S.split(" ")

    #print(S)

    arrSms = []
    testString = ""

    for word in S:
        if len(word) > K:
            return -1

    testString += S[0]

    for word in range(1,len(S)):
        if len(S[word]) + len(testString) + 1 > K:
            arrSms.append(testString)
            testString = S[word]
        else:
            testString += (" " + S[word])

    arrSms.append(testString)

    print(arrSms)
    print(len(arrSms))



solutions("SMS messages are really short", 12)