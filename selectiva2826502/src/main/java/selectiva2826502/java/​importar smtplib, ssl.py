​importar smtplib, ssl

importar getpass como gp
nombre de usuario = entrada('nsebastian2395@gmail.com ":')
ssl_context = ssl.create_default_context()
servidor = smtplib.SMTP_SSL('smtp.gmail.com', '587', contexto=ssl_context)
server.login(nombre de usuario, gp.getpass('Salome24'))
server.sendmail(nombre de usuario, nombre de usuario, f'Asunto: hola')

servidor.quit()