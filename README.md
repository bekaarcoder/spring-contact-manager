### Connecting DigitalOcean droplet with SSH

> ssh -i <ssh_key_filename> root@<ip_address_droplet>

Example:
> ssh -i id_rsa root@159.65.152.155

### Change mysql root password

>  alter user 'root'@'localhost' identified with mysql_native_password by 'mysqladmin'