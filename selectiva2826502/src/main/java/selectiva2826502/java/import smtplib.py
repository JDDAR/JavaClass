import smtplib

def send_email ():
    
    server = smtplib.SMTP('smtp.office365.com', 587)
    
    server.starttls()
    server.login('nelscastaeda@soy.sena.edu.co','')
    message = 'Subject: Prueba\n\nHola, esto es una prueba de correo'
    
    server.sendemail('nsebastian2395@gmail.com','kevinjrodriguez019@gmail.com', message)
    
    server.quit
        
        
send_email()
    
