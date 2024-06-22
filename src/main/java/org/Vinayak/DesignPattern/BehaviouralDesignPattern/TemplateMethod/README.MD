Template Method

When you want all classes to follow the specific steps to process the task but also 
Need to provide the flexibility that each class can have their own logic in that
specific steps.


Example

Lets say an Engineering College have multiple engineering streams,
like biotechnology, computer and mechanical.
All these have different fees and students need to provide 
required information as required.
Though admission process have information to fill and fees are different
but process flow is same for all.
Flow : 
1. AdmissionForm

    a.for biotechnology admission form would require math marks.
    
    b.for computer admission form would require math and physics.
    
    c.for mechanical would require physics and chemistry marks.

2. DocumentVerification
    
    a.for biotechnology - 10,12th mark sheet.
    
    b.for computer - course certificate,jee mark sheet.

    c.for mechanical - 12th mark sheet.
3. PayFees

    a.for biotechnology - 60k

    b.for computer - 70k

    c.for mechanical - 65k
4. HostelAllotment

    a.for biotechnology - Hostel A.

    b.for computer - Hostel B.

    c.for mechanical - Hostel C.

So in these example process flow for every field is same but
implementation is different.

To make sure that admission process for all fields follows exact flow
we use template method.
