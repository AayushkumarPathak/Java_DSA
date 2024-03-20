#include<iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int data) {
        this->data = data;
        this->next = NULL;
    }
};

class Stack {
private:
    Node* head;

public:
    Stack() {
        this->head = NULL;
    }

    bool isEmpty() {
        return head == NULL;
    }

    void push(int data) {
        Node* newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        }
        else {
            newNode->next = head;
            head = newNode;
        }
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head->data;
        Node* temp = head;
        head = head->next;
        delete temp;
        return top;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head->data;
    }
};

int main() {
    Stack s;
    int n;
    cin >> n;
    if (n == 0) {
        cout << "Stack is empty" << endl;
    }
    else {
        for (int i = 0; i < n; i++) {
            int val;
            cin >> val;
            s.push(val);
        }
    }

    while (!s.isEmpty()) {
        cout << s.pop() << " ";
    }
    cout << endl;

    
    while(!s.isEmpty()){
        int top = s.peek();
        cout<<"Top element is "<<top;
    }
    cout<<"stack is empty";

    // if (top != -1) {
    //     cout << "Top element is " << top << endl;
    // }
    // else {
    //     cout << "Stack is empty" << endl;
    // }

    return 0;
}
